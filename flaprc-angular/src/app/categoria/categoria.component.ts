import { Component, OnInit } from '@angular/core';
import { CategoriaService } from './categoria.service';
import { Categoria } from '../modelo/Categoria';

@Component({
  selector: 'app-categoria',
  templateUrl: './categoria.component.html',
  styleUrls: ['./categoria.component.css'],
  providers: [
    CategoriaService    
  ]
})
export class CategoriaComponent implements OnInit {

  categoria: Categoria;

  constructor(private categoriaService: CategoriaService) {
    this.categoria = new Categoria();
    this.categoria.descricao = "";
   }

  ngOnInit() {
  }

  salvarCategoria(): void {
    this.categoriaService.salvarCategoria(this.categoria);
  }

}
