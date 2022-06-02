import React, {useEffect, useState} from 'react';
import './App.css';
import {getString} from "./apiService";

export default function App() {

    const [text, setText] = useState()

    useEffect(()=>{
        getString()
            .then(data => setText(data))
            .catch(err => console.log(err.message))

    },[])

    return (
        <div className="App">
            {text}
        </div>
    );
}
