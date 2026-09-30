package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tvg implements e8h {
    public final /* synthetic */ vxg a;

    public tvg(vxg vxgVar) {
        this.a = vxgVar;
    }

    @Override // defpackage.e8h
    public final void c(String str, String str2, Bundle bundle) {
        vxg vxgVar = this.a;
        vxgVar.c(new owg(vxgVar, str, str2, bundle, true));
    }

    @Override // defpackage.e8h
    public final String d() {
        fug fugVar = new fug();
        vxg vxgVar = this.a;
        vxgVar.c(new cxg(vxgVar, fugVar, 3, false));
        return (String) fug.f(fugVar.e(500L), String.class);
    }

    @Override // defpackage.e8h
    public final String e() {
        fug fugVar = new fug();
        vxg vxgVar = this.a;
        vxgVar.c(new cxg(vxgVar, fugVar, 4, false));
        return (String) fug.f(fugVar.e(500L), String.class);
    }

    @Override // defpackage.e8h
    public final void f(Bundle bundle) {
        vxg vxgVar = this.a;
        vxgVar.c(new qwg(vxgVar, bundle));
    }

    @Override // defpackage.e8h
    public final void g(String str) {
        vxg vxgVar = this.a;
        vxgVar.c(new uwg(vxgVar, str, 2));
    }

    @Override // defpackage.e8h
    public final void h(String str) {
        vxg vxgVar = this.a;
        vxgVar.c(new uwg(vxgVar, str, 1));
    }

    @Override // defpackage.e8h
    public final long i() {
        return this.a.g();
    }

    @Override // defpackage.e8h
    public final void j(String str, String str2, Bundle bundle) {
        vxg vxgVar = this.a;
        vxgVar.c(new rwg(vxgVar, str, str2, bundle));
    }

    @Override // defpackage.e8h
    public final List k(String str, String str2) {
        return this.a.f(str, str2);
    }

    @Override // defpackage.e8h
    public final int l(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.e8h
    public final String m() {
        fug fugVar = new fug();
        vxg vxgVar = this.a;
        vxgVar.c(new cxg(vxgVar, fugVar, 1));
        return (String) fug.f(fugVar.e(50L), String.class);
    }

    @Override // defpackage.e8h
    public final String n() {
        fug fugVar = new fug();
        vxg vxgVar = this.a;
        vxgVar.c(new cxg(vxgVar, fugVar, 0));
        return (String) fug.f(fugVar.e(500L), String.class);
    }

    @Override // defpackage.e8h
    public final Map o(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }
}
