import { authenticate } from './auth.js';


document.onreadystatechange = ()  => {
    $("#sigin-b").click(authenticate)
}



