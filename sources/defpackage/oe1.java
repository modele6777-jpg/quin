package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface oe1 {
    default void b(i35 i35Var) {
        int i;
        String str;
        ArrayList arrayList = i35Var.a;
        int iE = e();
        if (iE == 1) {
            return;
        }
        int iB = kv2.B(iE);
        if (iB == 1) {
            i = 32;
        } else if (iB == 2) {
            i = 0;
        } else {
            if (iB != 3) {
                if (iE == 1) {
                    str = "UNKNOWN";
                } else if (iE == 2) {
                    str = "NONE";
                } else if (iE != 3) {
                    str = iE != 4 ? "null" : "FIRED";
                } else {
                    str = "READY";
                }
                b21.W("ExifData", "Unknown flash state: ".concat(str));
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            i35Var.c("LightSource", String.valueOf(4), arrayList);
        }
        i35Var.c("Flash", String.valueOf(i), arrayList);
    }

    wde c();

    int e();

    long i();

    me1 n();

    ke1 t();

    le1 y();
}
