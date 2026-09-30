package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ezd extends l7f {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ezd(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.o8f
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // defpackage.o8f
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // defpackage.l7f
    public final i8f g(j7f j7fVar) {
        int i = this.c;
        Object obj = this.d;
        j7fVar.getClass();
        switch (i) {
            case 0:
                if (!((ArrayList) obj).contains(j7fVar)) {
                    return null;
                }
                y22 y22VarM = j7fVar.m();
                y22VarM.getClass();
                return w8f.k((c8f) y22VarM);
            default:
                return (i8f) ((Map) obj).get(j7fVar);
        }
    }
}
