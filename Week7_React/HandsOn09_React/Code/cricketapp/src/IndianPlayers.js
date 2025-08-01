import React from 'react';

function IndianPlayers() {
    const indianTeam = ['Sachin', 'Dhoni', 'Virat', 'Rohit', 'Yuvraj', 'Raina'];

    // a. Destructure to get Odd and Even players
    const [first, second, third, fourth, fifth, sixth] = indianTeam;
    const oddPlayers = [first, third, fifth];
    const evenPlayers = [second, fourth, sixth];

    // b. Merge two arrays using the spread operator
    const T20players = ['First Player', 'Second Player', 'Third Player'];
    const RanjiTrophy = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
    const mergedPlayers = [...T20players, ...RanjiTrophy];

    return (
        <div>
            <h1>Indian Team</h1>

            <h3>Odd Players</h3>
            <ul>
                {oddPlayers.map((player, index) => <li key={index}>{player}</li>)}
            </ul>

            <h3>Even Players</h3>
            <ul>
                {evenPlayers.map((player, index) => <li key={index}>{player}</li>)}
            </ul>

            <hr />

            <h1>List of Indian Players Merged</h1>
            <ul>
                {mergedPlayers.map((player, index) => <li key={index}>{player}</li>)}
            </ul>
        </div>
    );
}

export default IndianPlayers;
