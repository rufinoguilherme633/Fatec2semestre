import {check, signout} from './auth.js'

document.onreadystatechange = ()  => {
    setInterval(check,100000)
    $("#signout-b").click(signout)
}


