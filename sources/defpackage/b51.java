package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b51 extends bu2 {
    public final /* synthetic */ int a;

    public /* synthetic */ b51(int i) {
        this.a = i;
    }

    @Override // defpackage.bu2
    public cu2 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, qzb qzbVar) {
        switch (this.a) {
            case 0:
                if (ftb.class.isAssignableFrom(an1.C(type))) {
                    return ndb.H0;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, qzbVar);
        }
    }

    @Override // defpackage.bu2
    public final cu2 b(Type type, Annotation[] annotationArr, qzb qzbVar) {
        switch (this.a) {
            case 0:
                if (type == vyb.class) {
                    return an1.F(annotationArr, p3e.class) ? hj6.f : af8.f;
                }
                if (type == Void.class) {
                    return ndb.I0;
                }
                if (an1.N0 && type == wef.class) {
                    return af8.g;
                }
                return null;
            default:
                if (an1.C(type) != Optional.class) {
                    return null;
                }
                return new mjg(qzbVar.d(an1.B(0, (ParameterizedType) type), annotationArr));
        }
    }
}
