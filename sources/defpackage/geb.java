package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class geb implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ufb b;

    public /* synthetic */ geb(ufb ufbVar, int i) {
        this.a = i;
        this.b = ufbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        ufb ufbVar = this.b;
        switch (i) {
            case 0:
                ufbVar.a();
                break;
            default:
                ((MotionEvent) obj).getClass();
                ufbVar.a();
                break;
        }
        return wefVar;
    }
}
