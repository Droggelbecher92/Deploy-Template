import axios from "axios";

export const getString = () =>{
    return axios.get("api/hangmen")
        .then(response => response.data)
}