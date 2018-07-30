import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { NetworthCalculatorComponent } from './networth-calculator/networth-calculator.component';

const routes: Routes = [
    {path: 'netWorthCalculator', component: NetworthCalculatorComponent}
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [
        RouterModule
    ],
    declarations: []
})
export class AppRoutingModule { }
