package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v38 st7[], still in use, count: 1, list:
  (r1v38 st7[]) from 0x02cd: CONSTRUCTOR (r2v32 mx4) = (r1v38 st7[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:718) call: mx4.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class st7 {
    b("class", true),
    c("annotation class", true),
    d("type parameter", false),
    e("property", true),
    f("field", true),
    g("local variable", true),
    v("value parameter", true),
    w("constructor", true),
    x("function", true),
    y("getter", true),
    z("setter", true),
    X("type usage", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("expression", false),
    Y("file", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("typealias", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("type projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("star projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("property constructor parameter", false),
    Z("class", false),
    E0("object", false),
    F0("standalone object", false),
    G0("companion object", false),
    H0("interface", false),
    I0("enum class", false),
    J0("enum entry", false),
    K0("local class", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF366("local function", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF379("member function", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF392("companion member function", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF405("top level function", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF418("companion extension function", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF431("member property", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF444("companion member property", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF457("member property with backing field", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF470("member property with delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF483("member property without backing field or delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF496("top level property", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF509("companion extension property", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF522("top level property with backing field", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF535("top level property with delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF548("top level property without backing field or delegate", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF562("backing field", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF576("initializer", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF589("destructuring declaration", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF602("lambda expression", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF615("anonymous function", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF628("object literal", false);

    public static final /* synthetic */ mx4 M0;
    public static final HashMap a;
    private final String description;
    private final boolean isDefault;

    static {
        mx4 mx4Var = new mx4(st7VarArr);
        M0 = mx4Var;
        a = new HashMap();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            st7 st7Var = (st7) l2Var.next();
            a.put(st7Var.name(), st7Var);
        }
        mx4 mx4Var2 = M0;
        ArrayList arrayList = new ArrayList();
        mx4Var2.getClass();
        l2 l2Var2 = new l2(0, mx4Var2);
        while (l2Var2.hasNext()) {
            Object next = l2Var2.next();
            if (((st7) next).isDefault) {
                arrayList.add(next);
            }
        }
        s72.o1(arrayList);
        s72.o1(M0);
        st7 st7Var2 = c;
        st7 st7Var3 = b;
        t72.I(st7Var2, st7Var3);
        t72.I(K0, st7Var3);
        t72.I(Z, st7Var3);
        st7 st7Var4 = G0;
        st7 st7Var5 = E0;
        t72.I(st7Var4, st7Var5, st7Var3);
        t72.I(F0, st7Var5, st7Var3);
        t72.I(H0, st7Var3);
        t72.I(I0, st7Var3);
        st7 st7Var6 = J0;
        st7 st7Var7 = e;
        st7 st7Var8 = f;
        t72.I(st7Var6, st7Var7, st7Var8);
        st7 st7Var9 = z;
        t72.H(st7Var9);
        st7 st7Var10 = y;
        t72.H(st7Var10);
        t72.H(x);
        st7 st7Var11 = Y;
        t72.H(st7Var11);
        c10 c10Var = c10.CONSTRUCTOR_PARAMETER;
        st7 st7Var12 = v;
        bm8.H(new iy9(c10Var, st7Var12), new iy9(c10.FIELD, st7Var8), new iy9(c10.PROPERTY, st7Var7), new iy9(c10.FILE, st7Var11), new iy9(c10.PROPERTY_GETTER, st7Var10), new iy9(c10.PROPERTY_SETTER, st7Var9), new iy9(c10.RECEIVER, st7Var12), new iy9(c10.SETTER_PARAMETER, st7Var12), new iy9(c10.PROPERTY_DELEGATE_FIELD, st7Var8));
    }

    public st7(String str, boolean z2) {
        super(str, i);
        this.description = str;
        this.isDefault = z2;
    }

    public static st7 valueOf(String str) {
        return (st7) Enum.valueOf(st7.class, str);
    }

    public static st7[] values() {
        return (st7[]) L0.clone();
    }
}
