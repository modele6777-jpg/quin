package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class skd {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final aw6 a(Context context) {
        aw6 aw6Var;
        aw6 aw6Var2;
        rkd rkdVar;
        rkd rkdVar2;
        rkd rkdVar3;
        rkd rkdVar4;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        aw6 aw6Var3 = obj instanceof aw6 ? (aw6) obj : null;
        if (aw6Var3 != null) {
            return aw6Var3;
        }
        aw6 aw6VarA = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof aw6) {
                aw6Var = (aw6) obj2;
                aw6Var2 = aw6VarA;
            } else {
                if (aw6VarA == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (obj2 instanceof rkd) {
                        rkdVar4 = (rkd) obj2;
                    } else {
                        rkdVar = null;
                    }
                    if (rkdVar != null) {
                        rkdVar = rkdVar4;
                        aw6VarA = rkdVar.a(applicationContext);
                    } else {
                        if (applicationContext instanceof rkd) {
                            rkdVar3 = (rkd) applicationContext;
                        } else {
                            rkdVar2 = null;
                        }
                        if (rkdVar2 != null) {
                            rkdVar = rkdVar4;
                            rkdVar = rkdVar4;
                            rkdVar2 = rkdVar3;
                            aw6VarA = rkdVar2.a(applicationContext);
                        } else {
                            rkdVar = rkdVar4;
                            rkdVar = rkdVar4;
                            rkdVar2 = rkdVar3;
                            aw6VarA = ukd.a.a(applicationContext);
                        }
                    }
                }
                aw6Var = aw6VarA;
                aw6Var2 = aw6Var;
            }
            while (!atomicReference.compareAndSet(obj2, aw6Var)) {
                if (atomicReference.get() != obj2) {
                    aw6VarA = aw6Var2;
                }
            }
            return aw6Var;
        }
    }
}
