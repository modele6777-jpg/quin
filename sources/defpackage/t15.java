package defpackage;

import java.util.ArrayList;
import tech.chatmind.api.events.model.EventInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t15 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ m25 b;

    public t15(xj5 xj5Var, m25 m25Var) {
        this.a = xj5Var;
        this.b = m25Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [pu4] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
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
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        s15 s15Var;
        EventInfo eventInfo;
        if (xn2Var instanceof s15) {
            s15Var = (s15) xn2Var;
            int i = s15Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                s15Var.label = i - Integer.MIN_VALUE;
            } else {
                s15Var = new s15(this, xn2Var);
            }
        } else {
            s15Var = new s15(this, xn2Var);
        }
        Object obj2 = s15Var.result;
        int i2 = s15Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            String str = (String) obj;
            int i3 = m25.g;
            boolean zQ = v4e.Q(str);
            Object arrayList = pu4.a;
            if (!zQ) {
                nh7 nh7VarE = fzc.a.e(str);
                yg7 yg7Var = nh7VarE instanceof yg7 ? (yg7) nh7VarE : null;
                if (yg7Var != null) {
                    arrayList = new ArrayList();
                    for (nh7 nh7Var : yg7Var.a) {
                        try {
                            xh7 xh7Var = fzc.a;
                            xh7Var.getClass();
                            eventInfo = (EventInfo) xh7Var.a(EventInfo.Companion.serializer(), nh7Var);
                        } catch (yyc e) {
                            this.b.d().g("skip unparseable event: " + e.getMessage());
                            eventInfo = null;
                        }
                        if (eventInfo != null) {
                            arrayList.add(eventInfo);
                        }
                    }
                }
            }
            s15Var.L$0 = null;
            s15Var.L$1 = null;
            s15Var.L$2 = null;
            s15Var.L$3 = null;
            s15Var.label = 1;
            Object objA = this.a.a(arrayList, s15Var);
            Object obj3 = bw2.a;
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
