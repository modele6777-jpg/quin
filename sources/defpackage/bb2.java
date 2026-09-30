package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bb2 extends w91 {
    @Override // defpackage.w91
    public final x91 a(Type type, Annotation[] annotationArr) {
        if (an1.C(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            qc0.p("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeB = an1.B(0, (ParameterizedType) type);
        if (an1.C(typeB) != qyb.class) {
            return new mjg(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new m6c(10, an1.B(0, (ParameterizedType) typeB));
        }
        qc0.p("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
