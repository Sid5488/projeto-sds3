const Footer = () => {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">
                    App desenvolvido por {' '}
                    <a href="https://github.com/acenelio" target="_blank" rel="noreferrer"> 
                        Guilherme Sousa
                    </a>
                </p>

                <p className="text-light">
                    <small>
                        <strong>Semana Spring React</strong>
                    
                        <br/>

                        Evento promovido pela escola DevSuperior:{' '}
                        <a href="https://www.instagram.com/sid_013/" target="_blank" rel="noreferrer">
                            @sid_013
                        </a>
                    </small>
                </p>
            </div>
        </footer>
    );
};

export default Footer;
