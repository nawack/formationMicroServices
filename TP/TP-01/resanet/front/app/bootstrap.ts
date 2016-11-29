import {bootstrap}  from 'angular2/platform/browser';
import {Resanet} from './resanet';
import {HTTP_PROVIDERS} from 'angular2/http';

bootstrap(Resanet, [HTTP_PROVIDERS]);
