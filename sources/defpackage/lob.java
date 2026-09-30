package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class lob implements x16 {
    public final /* synthetic */ int a;
    public final String b;
    public final xm7 c;
    public final String d;
    public final cya e;

    public /* synthetic */ lob(xm7 xm7Var, String str, String str2, cya cyaVar, int i) {
        this.a = i;
        this.c = xm7Var;
        this.b = str;
        this.d = str2;
        this.e = cyaVar;
    }

    @Override // defpackage.x16
    public final Object invoke() throws NoSuchFieldException {
        int i = this.a;
        String str = this.d;
        String str2 = this.b;
        cya cyaVar = this.e;
        switch (i) {
            case 0:
                uw7 uw7Var = (uw7) cyaVar;
                rob robVar = xm7.a;
                String str3 = this.b;
                um8 um8VarE = robVar.e(str3);
                xm7 xm7Var = this.c;
                if (um8VarE != null) {
                    return xm7Var.y(Integer.parseInt((String) ((sm8) um8VarE.a()).get(1)), str3);
                }
                if (xm7Var instanceof nm7) {
                    nm7 nm7Var = (nm7) xm7Var;
                    if (nm7Var.b.getAnnotation(Metadata.class) == null) {
                        try {
                            Field fieldC = xm7Var.C(uw7Var.getName());
                            if (Modifier.isStatic(fieldC.getModifiers())) {
                                return new gf7(xm7Var, fieldC, uw7Var.getBoundReceiver(), dm7.j);
                            }
                        } catch (Exception unused) {
                            if (str3.equals("getEntries()Lkotlin/enums/EnumEntries;")) {
                                return new oe7(nm7Var);
                            }
                        }
                    }
                }
                if (!(xm7Var instanceof nn7)) {
                    return new ny3(xm7Var, str, str3, uw7Var.getBoundReceiver());
                }
                return new gt7(xm7Var, str3, uw7Var.getBoundReceiver(), xm7Var.G(str, str3), dm7.j);
            case 1:
                zf3 zf3Var = (zf3) cyaVar;
                rob robVar2 = xm7.a;
                String str4 = this.b;
                um8 um8VarE2 = robVar2.e(str4);
                xm7 xm7Var2 = this.c;
                if (um8VarE2 != null) {
                    return xm7Var2.y(Integer.parseInt((String) ((sm8) um8VarE2.a()).get(1)), str4);
                }
                if ((xm7Var2 instanceof nm7) && ((nm7) xm7Var2).b.getAnnotation(Metadata.class) == null) {
                    Field fieldC2 = xm7Var2.C(zf3Var.getName());
                    if (Modifier.isStatic(fieldC2.getModifiers())) {
                        return new ye7(xm7Var2, fieldC2, zf3Var.getBoundReceiver(), dm7.j);
                    }
                }
                if (!(xm7Var2 instanceof nn7)) {
                    return new vx3(xm7Var2, str, str4, zf3Var.getBoundReceiver());
                }
                return new rs7(xm7Var2, str4, zf3Var.getBoundReceiver(), xm7Var2.G(str, str4), dm7.j);
            case 2:
                aya ayaVar = (aya) cyaVar;
                xm7 xm7Var3 = this.c;
                boolean z = xm7Var3 instanceof nn7;
                String str5 = this.d;
                if (!z) {
                    return new qy3(xm7Var3, str2, str5, ayaVar.getBoundReceiver());
                }
                return new jt7(xm7Var3, str5, ayaVar.getBoundReceiver(), xm7Var3.G(str2, str5), dm7.j);
            default:
                q79 q79Var = (q79) cyaVar;
                xm7 xm7Var4 = this.c;
                boolean z2 = xm7Var4 instanceof nn7;
                String str6 = this.d;
                if (!z2) {
                    return new xx3(xm7Var4, str2, str6, q79Var.getBoundReceiver());
                }
                return new ts7(xm7Var4, str6, q79Var.getBoundReceiver(), xm7Var4.G(str2, str6), dm7.j);
        }
    }

    public /* synthetic */ lob(String str, xm7 xm7Var, cya cyaVar, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = xm7Var;
        this.e = cyaVar;
        this.d = str2;
    }
}
