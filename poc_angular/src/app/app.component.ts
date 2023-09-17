import { Component } from '@angular/core';
import { ServidorProviderService } from './shared/servidor-provider.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  providers: [ServidorProviderService]
})
export class AppComponent {
  title = 'poc_angular';
  tecnologia: string | undefined;
  retornoMensagem: string | undefined;

  constructor(
    private servidorProvider: ServidorProviderService,
  ) {

  }

  javaBackendGetJson() {
    console.log("chamou - JAVA");
    this.tecnologia = "JAVA";

    this.servidorProvider.javaBackendGetJson().subscribe(
      (responseJson) => {
        let resultado = responseJson.resultado;
        let dados = responseJson.dados;
        this.retornoMensagem = JSON.stringify(dados);
      },
      (err) => {
        console.log("Erro ao chamar Backend de Java --> " + err)
      }
    );
  }

  nestJsBackendGetJson() {
    console.log("chamou - Nest-JS");
    this.tecnologia = "Nest-JS";

    this.servidorProvider.nestJsBackendGetJson().subscribe(
      (responseJson) => {
        this.retornoMensagem = JSON.stringify(responseJson);
      },
      (err) => {
        console.log("Erro ao chamar Backend de Nest-JS --> " + err)
      }
    );
  }
}
