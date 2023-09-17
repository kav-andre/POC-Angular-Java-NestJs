import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as express from 'express';
import * as cors from 'cors';

@Injectable()
export class ServidorProviderService {
  private javaHostBackend: string = "http://ec2-54-152-204-192.compute-1.amazonaws.com:8080/POC-Java-Backend";
  private nestJsHostBackend: string = "http://ec2-54-152-204-192.compute-1.amazonaws.com:3000";

  httpHeadersJson = {
    headers: new HttpHeaders(
      { 
        'Access-Control-Allow-Origin': '*', 
        'Access-Control-Allow-Methods': '*', 
        'Access-Control-Allow-Headers': '*', 
        'Content-Type': 'application/json'
      }
    )
  };

  constructor(private http: HttpClient) {
  }

  javaBackendGetJson():Observable<any> {
    return this.http.get<Object>(this.javaHostBackend + "/rest/unidadeFederacao/listar", this.httpHeadersJson);
  }

  nestJsBackendGetJson():Observable<any> {
    return this.http.get<Object>(this.nestJsHostBackend + "/ping", this.httpHeadersJson);
  }
}
