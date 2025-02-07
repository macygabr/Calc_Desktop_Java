# SmartCalc v3.0

Реализация SmartCalc v3.0 на языке Java.


## Contents

1. [Chapter I](#chapter-i) \
   1.1. [Introduction](#introduction)
2. [Chapter II](#chapter-ii) \
   2.1. [Паттерн MVP](#паттерн-mvp) \
   2.2. [Паттерн MVVM](#паттерн-mvvm)
3. [Chapter III](#chapter-iii) \
   3.1. [Part 1](#part-1-реализация-smartcalc-v30) \
   3.2. [Part 2](#part-2-дополнительно-кредитный-калькулятор) \
   3.3. [Part 3](#part-3-дополнительно-депозитный-калькулятор) \
   3.4. [Part 4](#part-4-дополнительно-конфигурация-и-логирование) \
   3.5. [Part 5](#part-5-дополнительно-кроссплатформенность)
4. [Chapter IV](#chapter-iv) 


## Chapter I

![SmartCalc_v3.0_Desktop](misc/images/APJ2_SmartCalc_v3.0_Desktop.png)

Чак опаздывал из-за чего был весь в спешке и никак не мог усидеть на месте. Только периодический суровый взгляд таксиста в зеркало заднего вида утихомиривал его каждый раз.

`-` Нельзя ли как-нибудь побыстрее, я очень спешу, - не выдержал Чак.

`-` Молодой человек, я еду с максимально разрешенной скоростью здесь и не собираюсь нарушать правила на ровном месте. Успокойтесь, до вашего места назначения осталось еще немного. А вообще вы могли бы заранее... - дальнейшие нравоучения Чак пропустил мимо ушей ни переключился снова на свой телефон. Время поджимало. \
За окном пролетали дома, пальмы, люди с собаками. В Калифорнии как обычно жарко в это время года, поэтому многие люди загорали на свои лужайках. Но Чака это не особо интересовало, он то и дело поглядывал то на карту, то на время в телефоне, оценивая сколько еще осталось ехать. Он пролетел полстраны не ради солнца, пляжа и отдыха. Его миссия заключалась в поиске ответов на свои вопросы и какой-то аноним любезно согласился ему их предоставить. Да, СМСка от него была не самая информативная: только адрес, время и обещания ответов, но Чак чувствовал, что тут ему точно помогут. Он подобрался к истине максимально близко.

Такси подъехало к небольшой площади, на которой стояло трое людей. В голове Чака крутилось: «Только бы не опоздал, только бы не опоздал». Он пулей вылетел из такси, уронив сумку на землю. Водитель что-то ему прокричал, но все внимание Чака в этот момент привлек другой знакомый голос:

`-` Чак?! И ты сюда же? - слегка удивленно произнесла Ева.

`-` О, Ева! Надо же было в такой дали встретиться. Как тесен мир однако! А в каком смысле сюда же? Ты тоже получила эту странную СМСку? - запыхавшись произнес Чак, все время озирающийся по сторонам, в поисках не то потенциальных опасностей, не то каких-либо интересностей. - Надеюсь я не опоздал.

`-` Мы все тут получили эту СМСку, - вмешался в разговор один из незнакомцев. - Я Джон, это Томас.

`-` Чак. Вот уж не думал, что такая загадочная встреча будет посреди ничего, - сказал в ответ Чак, оглядываясь по сторонам.

`-` Здесь все же не совсем ничего, - ответил второй, видимо Томас. - Еще несколько месяцев назад тут был неплохой оживленный джаз-клуб, принадлежащий отцу моего хорошего друга. С которым, как выяснилось, был знаком Джон. Он был твоим коллегой, верно? Вот только ни я, ни Джон ничего не слышали от него уже больше трех месяцев. А сам клуб.. Ну вы и так видите во что он превратился, - Томас с грустью обратил свой взгляд на постройку.

`-` А где вы работали? - спросила Ева у Джона.

`-` Местное подразделение SIS, - буркнул Джон в ответ. - Администрирование сетевых приложений и настройка компьютерной аппаратуры.

`-` Мы с Чаком тоже из SIS. Из разных отделов и из восточного подразделения правда, но тем не менее, - задумчиво произнесла Ева. - А ты Томас откуда?

`-` Advanced Solutions Inc. Дочка SIS, перешел туда относительно недавно. Пришлось взять отпуск, чтобы сюда добраться, но я серьезно беспокоился за Себа и похоже не зря. Получается мы все тут так или иначе связаны с SIS.

`-` И, похоже, что не только с ним, да, Ева? - отреагировал Чак. - У меня здесь есть с собой документы, которые думаю могут показаться вам интересными, где же они.. - неизвестно куда дальше бы зашел этот разговор, если бы не одновременное пиликанье и вибрация смартфонов у всех в карманах произошедшее в этот момент. В полученном всеми сообщении без автора было написано следующее:

> Приветствую всех и очень счастлив, что вы заинтересовались и смогли добраться до места назначения в указанное время. Вы собрались здесь не случайно и действительно получите все ответы. Но только после небольшого теста. Есть одно задание, которым любили проверять меня. Но теперь пришло время немного поменяться местами. Докажите, что вы готовы и сможете справиться с предстоящими заданиями, и тогда я отвечу на все ваши вопросы. Тестовое задание с подробностями уже ожидает вас на ваших личных репозиториях. Пожалуйста, приступите немедленно. Спасибо.

Чак не смог сдержать легкую улыбку на своем лице и прошептал только одно слово:

`-` Терминатор...

## Introduction

В данном проекте тебе предстоит реализовать на языке программирования Java расширенную версию обычного калькулятора, реализующую те же самые функции, что и разработанное ранее приложение в проекте SmartCalc v2.0. Ты сможешь улучшить свои навыки владения новым языком программирования, освоить паттерн MVP или MVVM, а также добавить в приложение функционал справки и истории вычислений.


## Chapter II

### Паттерн MVP

Паттерн MVP имеет общие с MVC два компонента: модель и представление. Но он заменяет контроллер на презентер.

Презентер реализует взаимодействие между моделью и представлением.
Когда представление уведомляет презентер, что пользователь что-то сделал (например, нажал кнопку), 
презентер принимает решение об обновлении модели и синхронизирует все изменения между моделью и представлением. 
Однако, презентер не общается с представлением напрямую. Вместо этого, он общается через интерфейс. 
Благодаря чему все компоненты приложения впоследствии могут быть протестированы по отдельности.

![](misc/images/MVP-Process.png)

### Паттерн MVVM

MVVM - это более современная эволюция MVC. Основная цель MVVM - обеспечить четкое разделение между уровнями представления и модели. 
MVVM поддерживает двустороннюю привязку данных между компонентами View и ViewModel.

Представление выступает подписчиком на события изменения значений свойств предоставляемых моделью представления (ViewModel). 
В случае, если в модели представления изменилось какое-либо свойство, то она оповещает всех подписчиков об этом, 
и представление, в свою очередь, запрашивает обновлённое значение свойства из модели представления. 
В случае, если пользователь воздействует на какой-либо элемент интерфейса, представление вызывает соответствующую команду, предоставленную моделью представления.

Модель представления — с одной стороны, абстракция представления, а с другой — обёртка данных из модели, подлежащих связыванию. 
То есть, она содержит модель, преобразованную к представлению, а также команды, которыми может пользоваться представление, чтобы влиять на модель.

![](misc/images/MVVM-Process.png)


## Chapter III

## Part 1. Реализация SmartCalc v3.0

Необходимо реализовать SmartCalc v3.0:

- Программа должна быть разработана на языке Java версии 8
- Код программы должен находиться в папке src
- При написании кода необходимо придерживаться Google Code Style
- Необходимо разработать десктопное приложение
- Подготовить установщик, который будет устанавливать приложение в систему со стандартными настройками (путь инсталляции, создание ярлыка)
- Необходимо подготовить реализацию с графическим пользовательским интерфейсом или под Linux, или под Mac OS, на базе любой GUI-библиотеки или фреймворка (допустима реализация слоя GUI на HTML/CSS/JS)
- Программа должна быть реализована с использованием паттерна MVVМ или MVP, а также:
    - не должно быть кода бизнес-логики в коде представлений
    - не должно быть кода интерфейса в модели, презентере и модели представления
- «Ядро» калькулятора в виде алгоритма формирования и вычисления польской нотации и различных вычислительных функций подключить в виде динамической библиотеки на C/C++ из проектов SmartCalc v1.0 или SmartCalc v2.0
- Модель должна представлять собой «Ядро» с оберткой на языке Java
- В модель должны быть вынесены все функциональные возможности калькулятора таким образом, чтобы в будущем ее можно было использовать без остальных слоев
- Подготовить полное покрытие unit-тестами методов, находящихся в слое модели
- В приложении должен быть реализован раздел справки с описанием интерфейса программы в произвольной форме
- Программа должна хранить историю операций, позволять загружать выражения из истории и очищать историю целиком
- История должна сохраняться между запусками приложения
- На вход программы могут подаваться как целые числа, так и вещественные числа, записанные и через точку, и в экспоненциальной форме записи
- Вычисление должно производится после полного ввода вычисляемого выражения и нажатия на символ `=`
- Вычисление произвольных скобочных арифметических выражений в инфиксной нотации
- Вычисление произвольных скобочных арифметических выражений в инфиксной нотации с подстановкой значения переменной _x_ в виде числа
- Построение графика функции, заданной с помощью выражения в инфиксной нотации с переменной _x_  (с координатными осями, отметкой используемого масштаба и сеткой с адаптивным шагом)
    - Не требуется предоставлять пользователю возможность менять масштаб
- Область определения и область значения функций ограничиваются по крайней мере числами от -1000000 до 1000000
    - Для построения графиков функции необходимо дополнительно указывать отображаемые область определения и область значения
- Проверяемая точность дробной части - минимум 7 знаков после запятой
- У пользователя должна быть возможность ввода до 255 символов
- Скобочные арифметические выражения в инфиксной нотации должны поддерживать следующие арифметические операции и математические функции:
    - **Арифметические операторы**:

      | Название оператора | Инфиксная нотация <br /> (Классическая) | Префиксная нотация <br /> (Польская нотация) |  Постфиксная нотация <br /> (Обратная польская нотация) |
      | ------ | ------ | ------ | ------ |
      | Скобки | (a + b) | (+ a b) | a b + |
      | Сложение | a + b | + a b | a b + |
      | Вычитание | a - b | - a b | a b - |
      | Умножение | a * b | * a b | a b * |
      | Деление | a / b | / a b | a b \ |
      | Возведение в степень | a ^ b | ^ a b | a b ^ |
      | Остаток от деления | a mod b | mod a b | a b mod |
      | Унарный плюс | +a | +a | a+ |
      | Унарный минус | -a | -a | a- |

      >Обратите внимание, что оператор умножения содержит обязательный знак `*`. Обработка выражения с опущенным знаком `*` является необязательной и остается на усмотрение разработчика

    - **Функции**:

      | Описание функции | Функция |   
      | ---------------- | ------- |  
      | Вычисляет косинус | cos(x) |   
      | Вычисляет синус | sin(x) |  
      | Вычисляет тангенс | tan(x) |  
      | Вычисляет арккосинус | acos(x) | 
      | Вычисляет арксинус | asin(x) | 
      | Вычисляет арктангенс | atan(x) |
      | Вычисляет квадратный корень | sqrt(x) |
      | Вычисляет натуральный логарифм | ln(x) | 
      | Вычисляет десятичный логарифм | log(x) |

## Part 2. Дополнительно. Кредитный калькулятор

Предусмотреть специальный режим «кредитный калькулятор» (за образец можно взять сайты banki.ru и calcus.ru):
- Вход: общая сумма кредита, срок, процентная ставка, тип (аннуитетный, дифференцированный)
- Выход: ежемесячный платеж, переплата по кредиту, общая выплата

## Part 3. Дополнительно. Депозитный калькулятор

Предусмотреть специальный режим «калькулятор доходности вкладов» (за образец можно взять сайты banki.ru и calcus.ru):
- Вход: сумма вклада, срок размещения, процентная ставка, налоговая ставка, периодичность выплат, капитализация процентов, список пополнений, список частичных снятий
- Выход: начисленные проценты, сумма налога, сумма на вкладе к концу срока

## Part 4. Дополнительно. Конфигурация и логирование

Добавить в приложение настройки:
- Добавить считывание настроек из файла конфигурации при запуске программы
- Вынести в файл конфигурации от 3 параметров на выбор, например цвет заднего фона, размер шрифта и т. д.
- Добавить описание редактируемых параметров в справку

Добавить в приложение логирование:
- В логах хранить историю операций
- Логи сохранять в папку logs, по одному файлу на период ротации
- Должна быть возможность настройки периода ротации логов (час/день/месяц)
- Файлы должны быть названы в соответствии со следующим шаблоном: `logs_dd-MM-yy-hh-mm-ss` (указывается время создания файла)

## Part 5. Дополнительно. Кроссплатформенность

Сделать приложение кроссплатформенным:
- Добавь поддержку трех ОС: Linux, Mac и Windows
- Установщик также должен быть доступен под ОС Linux, Mac и Windows (допустимо использование нескольких разных установщиков)


## Chapter IV

Чак закончил разработку калькулятора без каких-либо сложностей. Он знал Java еще с университетских времен, поэтому быстро сделал простенькое десктопное приложение. Другие ребята тоже уже во всю заканчивали свою работу. \
Как только все управились, на их телефоны сразу же прилетели новые сообщения от анонима:

> Спасибо. Как я вижу вы все успешно справились с заданием. Это прекрасно, хотя алгоритмы и так предсказывали это с самого начала. Пожалуйста настройте безопасное соединение с указанным в следующем сообщении сервером и подключитесь к указанному чату. Там мы сможем с вами свободно и спокойно переговорить. Для Томаса и Джона у меня также есть специальная информация касательно вашего друга, Себа. Ожидаю вас в чате!

💡 [Нажми сюда](https://forms.yandex.ru/cloud/6418259f73cee70c7447898c/), **чтобы поделиться с нами обратной связью на этот проект**. Это анонимно и поможет команде Продукта сделать твоё обучение лучше.
