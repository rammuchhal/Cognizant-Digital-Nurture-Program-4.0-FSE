import React from 'react';

function ListOfPlayers() {
    // Declare an array of 11 players with their scores
    const players = [
        { name: 'Jack', score: 50 },
        { name: 'Michael', score: 70 },
        { name: 'John', score: 61 },
        { name: 'Ann', score: 80 },
        { name: 'Elizabeth', score: 65 },
        { name: 'Sachin', score: 100 },
        { name: 'Dhoni', score: 90 },
        { name: 'Virat', score: 85 },
        { name: 'Jadeja', score: 60 },
        { name: 'Rohit', score: 95 },
        { name: 'Second', score: 75 },
    ];

    // Filter players with scores less than 70
    const playersBelow70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h1>List of Players</h1>
            <ul>
                {/* Map through all players and display their name and score */}
                {players.map((player, index) => (
                    <li key={index}>
                        Mr. {player.name} - Score: {player.score}
                    </li>
                ))}
            </ul>

            <hr />

            <h1>List of Players having Scores Less than 70</h1>
            <ul>
                {/* Map through the filtered list of players */}
                {playersBelow70.map((player, index) => (
                    <li key={index}>
                        Mr. {player.name} - Score: {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListOfPlayers;
