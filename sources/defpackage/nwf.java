package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nwf implements AutoCloseable {
    public final String a;
    public final hr7 b;

    public nwf(String str, hr7 hr7Var) {
        this.a = str;
        this.b = hr7Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        hr7 hr7Var = this.b;
        String str = this.a;
        szc szcVar = hr7Var.c;
        szcVar.getClass();
        nfc nfcVar = (nfc) ((ConcurrentHashMap) szcVar.d).get(str);
        if (nfcVar != null) {
            ta0 ta0Var = ((hr7) szcVar.b).d;
            ta0Var.getClass();
            u57[] u57VarArr = (u57[]) ((ConcurrentHashMap) ta0Var.d).values().toArray(new u57[0]);
            ArrayList<tfc> arrayList = new ArrayList();
            for (u57 u57Var : u57VarArr) {
                if (u57Var instanceof tfc) {
                    arrayList.add(u57Var);
                }
            }
            for (tfc tfcVar : arrayList) {
                tfcVar.getClass();
                synchronized (tfcVar) {
                    tfcVar.b.remove(nfcVar.b);
                }
            }
            ((ConcurrentHashMap) szcVar.d).remove(nfcVar.b);
        }
    }
}
