import {Transport} from './transport'
import {Pipe, PipeTransform} from 'angular2/core';

@Pipe({ name: 'dtypeFilter' })
export class DtypeFilterPipe implements PipeTransform {
    transform(transports: Transport[]) {
        return transports.filter(transport => transport.dtype == "Train");
    }
}