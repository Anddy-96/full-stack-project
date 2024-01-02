
import './App.css';

function App() {
  let endpoint = "api/auth/login";

fetch(endpoint, {
  headers: {"Content-Type":"application/json"}, method:"post"})



  return (
    <div className="App">
     <h1> Hello World </h1> 
    </div>
  );
}

export default App;
