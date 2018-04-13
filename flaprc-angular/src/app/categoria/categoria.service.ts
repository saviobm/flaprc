import { Injectable } from '@angular/core';
import { Categoria } from '../modelo/Categoria';
import { Http, Response, RequestOptions, Headers } from '@angular/http';

@Injectable()
export class CategoriaService {

  private url: string = "http://localhost:8080/categoria-controller";

  private headers = new Headers({ 'Content-Type': 'application/json' });
  private options = new RequestOptions({ headers: this.headers });

  constructor(private http: Http) { }

  salvarCategoria(categoria: Categoria): void {

    //let urlCategoria: string = this.url + "/salvarCategoria";

    this.http.post(this.url + "/salvarCategoria", categoria, this.options).toPromise()
       .then(this.extractData).catch(this.handleErrorPromise);

    console.log(categoria.descricao);

  }

  extractData(res: Response) {
    
    let categoria: Categoria = res.json() as Categoria;

    console.log("id: " + categoria.id);
    

  }
  
  handleErrorPromise (error: Response | any) {    

  } 

}
