package defpackage;

import java.util.HashMap;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n71 {
    public static final n71 a;
    public static final n71 b;
    public static final n71 c;
    public static final n71 d;
    public static final HashMap e;
    public static final /* synthetic */ n71[] f;

    /* JADX INFO: Fake field, exist only in values array */
    n71 EF1;

    static {
        n71 n71Var = new n71("target", 0);
        n71 n71Var2 = new n71("root", 1);
        n71 n71Var3 = new n71("nth_child", 2);
        a = n71Var3;
        n71 n71Var4 = new n71("nth_last_child", 3);
        n71 n71Var5 = new n71("nth_of_type", 4);
        b = n71Var5;
        n71 n71Var6 = new n71("nth_last_of_type", 5);
        c = n71Var6;
        n71 n71Var7 = new n71("first_child", 6);
        n71 n71Var8 = new n71("last_child", 7);
        n71 n71Var9 = new n71("first_of_type", 8);
        n71 n71Var10 = new n71("last_of_type", 9);
        n71 n71Var11 = new n71("only_child", 10);
        n71 n71Var12 = new n71("only_of_type", 11);
        n71 n71Var13 = new n71("empty", 12);
        n71 n71Var14 = new n71("not", 13);
        n71 n71Var15 = new n71("lang", 14);
        n71 n71Var16 = new n71("link", 15);
        n71 n71Var17 = new n71("visited", 16);
        n71 n71Var18 = new n71("hover", 17);
        n71 n71Var19 = new n71(UsageBillingBalance.STATUS_ACTIVE, 18);
        n71 n71Var20 = new n71("focus", 19);
        n71 n71Var21 = new n71("enabled", 20);
        n71 n71Var22 = new n71("disabled", 21);
        n71 n71Var23 = new n71("checked", 22);
        n71 n71Var24 = new n71("indeterminate", 23);
        n71 n71Var25 = new n71("UNSUPPORTED", 24);
        d = n71Var25;
        f = new n71[]{n71Var, n71Var2, n71Var3, n71Var4, n71Var5, n71Var6, n71Var7, n71Var8, n71Var9, n71Var10, n71Var11, n71Var12, n71Var13, n71Var14, n71Var15, n71Var16, n71Var17, n71Var18, n71Var19, n71Var20, n71Var21, n71Var22, n71Var23, n71Var24, n71Var25};
        e = new HashMap();
        for (n71 n71Var26 : values()) {
            if (n71Var26 != d) {
                e.put(n71Var26.name().replace('_', '-'), n71Var26);
            }
        }
    }

    public static n71 valueOf(String str) {
        return (n71) Enum.valueOf(n71.class, str);
    }

    public static n71[] values() {
        return (n71[]) f.clone();
    }
}
