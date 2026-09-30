package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qp3 extends w91 {
    public final Executor a;

    public qp3(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.w91
    public final x91 a(Type type, Annotation[] annotationArr) {
        if (an1.C(type) != u91.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a90(25, an1.B(0, (ParameterizedType) type), an1.F(annotationArr, jod.class) ? null : this.a);
        }
        qc0.j("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
