import { Injectable } from '@nestjs/common';
import { Ping } from './models/ping.model';

@Injectable()
export class AppService {
  getHello(): string {
    return 'Hello World! Huuuray!!!';
  }

  getPing(): Ping {
    const ping: Ping = new Ping();
    ping.codigo = 10;
    ping.descricao = "Teste POC";
    return ping;
  }
}
