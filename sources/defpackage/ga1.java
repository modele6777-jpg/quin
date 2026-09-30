package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ga1 implements cm7, Serializable, hs7 {
    public static final Object NO_RECEIVER = fa1.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient cm7 reflected;
    private final String signature;

    public ga1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.cm7
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.cm7
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public cm7 compute() {
        cm7 cm7Var = this.reflected;
        if (cm7Var != null) {
            return cm7Var;
        }
        cm7 cm7VarComputeReflected = computeReflected();
        this.reflected = cm7VarComputeReflected;
        return cm7VarComputeReflected;
    }

    public abstract cm7 computeReflected();

    @Override // defpackage.hs7
    public GenericDeclaration findJavaDeclaration() {
        return hkg.o0(getOwner(), getSignature());
    }

    @Override // defpackage.bm7
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.cm7
    public String getName() {
        return this.name;
    }

    public vm7 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? job.a.c(cls) : job.a.b(cls);
    }

    @Override // defpackage.cm7
    public List<aob> getParameters() {
        return getReflected().getParameters();
    }

    public abstract cm7 getReflected();

    @Override // defpackage.cm7
    public yn7 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.cm7, defpackage.bo7
    public List<ao7> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.cm7
    public jo7 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.cm7
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.cm7
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.cm7
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
