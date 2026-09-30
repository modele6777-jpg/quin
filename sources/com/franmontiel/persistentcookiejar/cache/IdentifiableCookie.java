package com.franmontiel.persistentcookiejar.cache;

import defpackage.eu2;
import defpackage.ub3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
class IdentifiableCookie {
    public eu2 a;

    public final boolean equals(Object obj) {
        eu2 eu2Var = this.a;
        if (!(obj instanceof IdentifiableCookie)) {
            return false;
        }
        eu2 eu2Var2 = ((IdentifiableCookie) obj).a;
        return eu2Var2.a.equals(eu2Var.a) && eu2Var2.d.equals(eu2Var.d) && eu2Var2.e.equals(eu2Var.e) && eu2Var2.f == eu2Var.f && eu2Var2.i == eu2Var.i;
    }

    public final int hashCode() {
        eu2 eu2Var = this.a;
        return ((ub3.c(ub3.c(ub3.c(527, 31, eu2Var.a), 31, eu2Var.d), 31, eu2Var.e) + (!eu2Var.f ? 1 : 0)) * 31) + (!eu2Var.i ? 1 : 0);
    }
}
