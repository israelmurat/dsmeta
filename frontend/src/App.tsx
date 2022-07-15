import NotificationButton from "./components/NotificationButton"
import Header from "./components/Header"
import SalesCard from "./components/SalesCard"

function App() {
  /* Exemplo: </> (Fragment): serve para retornar mais de 1 componente
  return (
    </> 
      <h1>Olá mundo!</h1>
      <NotificationButton />
    </>
  )*/

  return (
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />
          </div>
        </section>
      </main>
    </>
  )

}

export default App
