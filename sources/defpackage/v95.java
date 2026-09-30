package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v95 extends bu2 {
    public final oq8 a;
    public final kb6 b;

    public v95(oq8 oq8Var, kb6 kb6Var) {
        this.a = oq8Var;
        this.b = kb6Var;
    }

    @Override // defpackage.bu2
    public final cu2 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, qzb qzbVar) {
        type.getClass();
        annotationArr2.getClass();
        kb6 kb6Var = this.b;
        return new gg7(this.a, afc.n(((wg7) kb6Var.b).b, type), kb6Var, 25);
    }

    @Override // defpackage.bu2
    public final cu2 b(Type type, Annotation[] annotationArr, qzb qzbVar) {
        annotationArr.getClass();
        kb6 kb6Var = this.b;
        return new fz3(1, afc.n(((wg7) kb6Var.b).b, type), kb6Var);
    }
}
