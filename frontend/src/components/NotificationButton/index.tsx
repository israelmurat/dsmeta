import icon from '..//../assets/img/notification-icon.svg'; // importa a imagem
// icon - um apelido para a imagem
// ../ - Volta 1 nivel

import './style.css'; // Para arquivos na mesma pasta, coloca ./

function NotificationButton() {
    return (
        <div className="dsmeta-red-btn" /* No React usa className ao inves de class */>
            <img src={icon} alt="Notificar" /* usa o apelido entre chaves *//>
        </div>
    )
}

export default NotificationButton;
