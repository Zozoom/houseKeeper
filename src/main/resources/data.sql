insert into Blogger (name) VALUES ('Anyonymus');
insert into STORY (title,
                  city,
                  houseValue,
                  picture_Url,
                  link_To_House,
                  seller_Name,
                  phone_Number,
                  called,
                  content,
                  posted,
                  blogger_id)
                  values ('Karancslapujtő családi ház eladó, Petőfi út, 3 szobás',
                  'Karancslapujtő',
                  '14.000.000',
                  'https://kepek.otthonterkep.hu/d/1505702/7.jpg?c=1515832956',
                  'https://kepek.otthonterkep.hu/d/1505702/7.jpg?c=1515832956',
                  'Sebestyén Viktória',
                  '+36 20 977 4118',
                  FALSE,
                  'Tulajdonostól eladó csendes helyen, központhoz közel, 150 m2-es családi ház. A ház az 1970-es években épült, folyamatosan lakott volt. 2008-ban teljes körű felújításon esett át. Két szintes: az alsó szinten 3 nagy tároló helyiség található, az egyikben kézmosó és WC is van kialakítva. A felső szinten előtér, WC, amerikai konyha+étkező+nappali, 2 hálószoba. Mindkét hálószobához önálló fürdő van kialakítva (WC+zuhanyzó). A konyhához spajz is tartozik.
A tetőtér beépíthető.
A ház központi fűtése cirko-gázkazánnal van biztosítva, mely időkapcsolóval programozható is. A falak külső felülete 8 cm-es szigeteléssel van ellátva, belső felületükön gipszkarton borítás található. Az épület hőszigetelt nyílászárókkal rendelkezik. A tetőszerkezet teljes felújítására és a tetőburkolat cseréjére is sor került a felújítás során. Az épület riasztórendszerrel védett.
A ház mögött kb. 20 m2-es fedett autó-beálló található.
Az udvaron kb. 40 m2-es fedett filagóra áll, mely alatt egy kb. 25 m2-es jól funkcionáló pince van. A kert többi része füvesített, gyümölcsfákkal és egy kis fenyvessel.
Csodálatos a kilátás a Karancs-hegyre, a közelben található Salgó és Somoskő vára.
A faluban orvos, iskola, óvoda, posta, boltok, rendőrség található. A kényelem és a komfort teljes mértékben biztosítva van.',
                  CURRENT_DATE(),
                  (select id FROM BLOGGER where name = 'Anyonymus') );

insert into STORY (title,
                  city,
                  houseValue,
                  picture_Url,
                  link_To_House,
                  seller_Name,
                  phone_Number,
                  called,
                  content,
                  posted,
                  blogger_id)
                  values ('Családi ház Karancsalján',
                  'Karancsalja',
                  '13.800.000',
                  'https://img.jofogas.hu/hdimages/Csaladi_haz_Karancsaljan_389991084232576.jpg',
                  'https://img.jofogas.hu/hdimages/Csaladi_haz_Karancsaljan_389991084232576.jpg',
                  'Szabó László',
                  '+36303037929',
                  TRUE,
                  'Eladom csendes, biztonságos helyen levő házamat.
Tetőtér beépítéses, 2 fürdőszoba, 2wc, gázközponti-padlófűtéses, hatalmas cserépkályha, száraz pincehelyiségek, ásott kút az udvaron, kinti beton pince, melléképület.
A tetőtérben klíma, 3db egybenyitott szoba, zuhanykabin, wc-vel.
3 erkély.
Lennt 2 szoba, nappali, konyha, fürdőszoba, külön wc-vel. Északi, hüvös speiz a konyha mellett. Beépített szekrények az egyik lenti szobában, 2db lenyitható ággyal, polcok és akasztós részekkel.
A konyhából a Karancshegy látható, a kert végén a Dobroda patak.',
                  CURRENT_DATE(),
                  (select id FROM BLOGGER where name = 'Anyonymus') );