import Navbar from 'components/Navbar';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable';

const App = () => {
  return (
    <>
      <Navbar />
      
      <div className="container">
        <h1 className="text-primary">Hello World!</h1>
        
        <DataTable />
      </div>
      
      <Footer />
    </>
  );
};

export default App;
