import { Controller, Get, Redirect } from '@nestjs/common';
import { AppService } from './app.service';
import { Ping } from './models/ping.model';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get()
  getHello(): string {
    return this.appService.getHello();
  }

  @Get('/ping')
  getPing(): Ping {
    return this.appService.getPing();
  }

  @Get('/docs')
  @Redirect('https://docs.nestjs.com', 301)
  getDocs() {
    return {
      url: 'https://docs.nestjs.com/v5/'
    }
  }
}
