import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `
    <h1>Hello {{name}}</h1>
    <clr-icon shape="info-circle"></clr-icon>

`,
})
export class AppComponent  { name = 'Angular2'; }
