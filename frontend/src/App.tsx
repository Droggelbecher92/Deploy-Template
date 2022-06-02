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

    const alphabet = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"];

    return (
        <div className="App">
            {text}
            {alphabet.map(letter=>
                <button key={letter}>{letter}</button>
            )}
        </div>
    );
}
