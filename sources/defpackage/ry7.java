package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ry7 implements wn7 {
    public final lw7 a;

    public ry7(x16 x16Var) {
        this.a = eb3.N(z18.b, x16Var);
    }

    @Override // defpackage.cm7
    public final Object call(Object... objArr) {
        objArr.getClass();
        return f().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.cm7
    public final Object callBy(Map map) {
        map.getClass();
        return f().callBy(map);
    }

    public final boolean equals(Object obj) {
        return pa7.t(f(), obj);
    }

    public final wn7 f() {
        return (wn7) this.a.getValue();
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return f().getAnnotations();
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return f().getParameters();
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return f().getReturnType();
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return f().getTypeParameters();
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        return f().getVisibility();
    }

    public final int hashCode() {
        return f().hashCode();
    }

    @Override // defpackage.cm7
    public final boolean isAbstract() {
        return f().isAbstract();
    }

    @Override // defpackage.cm7
    public final boolean isFinal() {
        return f().isFinal();
    }

    @Override // defpackage.cm7
    public final boolean isOpen() {
        return f().isOpen();
    }

    public final String toString() {
        return f().toString();
    }
}
