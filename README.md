# AppVideo

App simples que reproduz 2 vídeos carregados direto da internet: um trecho de Big Buck
Bunny (Blender Foundation, CC BY 3.0) e o vídeo de exemplo "Flower" da MDN/Mozilla (CC0)
— créditos exibidos na tela. 4 botões em linha única: Vídeo 1, Vídeo 2, Pausar/Play,
Reiniciar. Mesma paleta de cores e mesmo layout no app Android e na versão Expo/Snack.

## Como subir para o GitHub

1. Abra este projeto no Android Studio (File > Open, selecione a pasta `AppVideo-Android`)
   e deixe o Gradle sincronizar.
2. Rode o app num emulador ou celular pra conferir se tudo funciona.
3. No terminal, dentro da pasta do projeto:
   ```
   git init
   git add .
   git commit -m "AppVideo - player com 2 videos"
   git branch -M main
   git remote add origin https://github.com/SEU-USUARIO/AppVideo.git
   git push -u origin main
   ```
   (crie o repositório vazio antes no GitHub, com esse mesmo nome)
4. Copie o link do repositório para entregar.

## Como gerar o link do Snack

1. Acesse https://snack.expo.dev
2. Apague o conteúdo padrão de `App.js` e cole o conteúdo do arquivo `App.js` da pasta
   `AppVideo-Snack` (o Snack detecta o `import { Video } from 'expo-av'` e adiciona a
   dependência sozinho).
3. Espere o preview carregar (aba Web ou o QR code com o app Expo Go) e confirme que os
   vídeos tocam.
4. Clique em "Save" (é preciso estar logado). O Snack gera uma URL própria — esse é o
   link para entregar.

## Observação sobre os vídeos

Os links foram testados e confirmados no ar antes de entrar no projeto:
- `https://www.w3schools.com/html/movie.mp4` (trecho de Big Buck Bunny, Blender
  Foundation, CC BY 3.0)
- `https://interactive-examples.mdn.mozilla.net/media/cc0-videos/flower.mp4` (amostra
  oficial da MDN/Mozilla, CC0)

Por isso o crédito de autoria aparece embaixo do player em ambos os apps. Se quiser trocar
por outros vídeos seus ou de terceiros, troque as URLs em `video1Url`/`video2Url`
(Android) e no objeto `VIDEOS` (Snack), e ajuste o texto de crédito — só evite reusar o
bucket antigo `commondatastorage.googleapis.com`, que é instável.
