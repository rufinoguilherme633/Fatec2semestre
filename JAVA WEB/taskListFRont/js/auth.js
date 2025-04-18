const base_url = "http://localhost:8081";

const authenticate = () => {
    const email = $("#e").val();
    const password = $("#p").val();
    const body = JSON.stringify({ email, password });

    $.ajax({
        type: 'POST',
        url: `${base_url}/auth/signin`, // fixed URL string
        contentType: 'application/json',
        dataType: 'json',
        data: body,
        success: (res) => {
            console.log(res);
            localStorage.setItem("token", res.token);
            window.location.href = "main.html"
        },


    });
};




const signout = () => {
    $.ajax({
        type: 'POST',
        url: `${base_url}/auth/signout`, // fixed URL string
        headers:{"token":localStorage.getItem("token")
           
        },
        success: (res) => {
            console.log("sucess",res);
           
        },
        error:((res) => {
            console.log("error"+ res)
            check();
        })
        


    });
}

const check = () =>{
    $.ajax({
        type: 'POST',
        url: `${base_url}/auth/check`, // fixed URL string
        headers:{"token":localStorage.getItem("token")
           
        },
        success: (res) => {
            console.log("sucess",res);
           
        },
        error:((res) => {
            console.log("error"+ res)
            localStorage.removeItem("token")
            window.localStorage.href ="index.html"
        })
        


    });
}
export {authenticate, signout,check}
