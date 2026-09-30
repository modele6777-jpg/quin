package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class re7 extends xnb {
    public final xm7 c;
    public final Member d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re7(xm7 xm7Var, Member member, Object obj, dm7 dm7Var) {
        super(dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        this.c = xm7Var;
        this.d = member;
        this.e = obj;
    }

    @Override // defpackage.wnb
    public final boolean E() {
        int modifiers = this.d.getModifiers();
        dx5 dx5Var = sqf.a;
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        Member memberB = h().b();
        AnnotatedElement annotatedElement = memberB instanceof AnnotatedElement ? (AnnotatedElement) memberB : null;
        if (annotatedElement == null) {
            return pu4.a;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return sqf.t(qd0.G0(annotations));
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        int modifiers = this.d.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return jo7.a;
        }
        if (Modifier.isPrivate(modifiers)) {
            return jo7.d;
        }
        return null;
    }

    @Override // defpackage.wnb
    public d09 i() {
        d09 d09Var = this.a.b;
        if (d09Var != null) {
            return d09Var;
        }
        Member member = this.d;
        if (Modifier.isFinal(member.getModifiers()) || vpf.J(member)) {
            return d09.FINAL;
        }
        return Modifier.isAbstract(member.getModifiers()) ? d09.ABSTRACT : d09.OPEN;
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return this.c;
    }

    @Override // defpackage.wnb
    public final Object x() {
        return this.e;
    }
}
