import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { ColorPickerComponent } from './color-picker/color-picker.component';
import { CountdownTimerComponent } from './countdown-timer/countdown-timer.component';
import { CountdownTimerGetSetComponent } from './countdown-timer-get-set/countdown-timer-get-set.component';
import { NameCardComponent } from './name-card/name-card.component';
import { PetComponent } from './pet/pet.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';

const routes: Routes = [
  { path: "caculator", component: CalculatorComponent },
  { path: "color-picker", component: ColorPickerComponent },
  { path: "countdown-time", component: CountdownTimerComponent },
  { path: "countdown-time-get-set", component: CountdownTimerGetSetComponent },
  { path: "name-card", component: NameCardComponent },
  { path: "pet", component: PetComponent },
  { path: "progress-bar", component: ProgressBarComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
