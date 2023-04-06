<?php

//В переменную $token нужно вставить токен, который нам прислал @botFather
$token = "1094153697:AAFiLXXXXXLl0hRDsxBij1lddKydKxSSsOg04";

//Сюда вставляем chat_id
$chat_id = "6173371023";

//Определяем переменные для передачи данных из нашей формы
if ($_POST['act'] == 'order') {
    $message = ($_POST['message']);
    $email = ($_POST['email']);
    $name = ($_POST['name']);
    $phone = ($_POST['phone']);
    $subject = ($_POST['subject']);

//Собираем в массив то, что будет передаваться боту
    $arr = array(
        'Заказ:' => $message,
        'email'  => $email
        'Имя:' => $name,
        'Телефон:' => $phone
        "Адрес" => $subject
    );

//Настраиваем внешний вид сообщения в телеграме
    foreach($arr as $key => $value) {
        $txt .= "<b>".$key."</b> ".$value."%0A";
    };

//Передаем данные боту
    $sendToTelegram = fopen("https://api.telegram.org/bot{6173371023:AAHW48m_xi2r-SKaGBDa05zOw1OihYEM4xI}/sendMessage?chat_id={6173371023}&parse_mode=html&text={$txt}","r");

//Выводим сообщение об успешной отправке
    if ($sendToTelegram) {
        alert('Спасибо! Ваша заявка принята. Мы свяжемся с вами в ближайшее время.');
    }

//А здесь сообщение об ошибке при отправке
    else {
        alert('Что-то пошло не так. ПОпробуйте отправить форму ещё раз.');
    }
}

?>