package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class al2 extends bk9 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public al2(String str) {
        super("the predefined string ".concat(str), Integer.valueOf(str.length()));
        this.d = str;
    }

    @Override // defpackage.bk9
    public final dk9 a(Object obj, CharSequence charSequence, int i, int i2) {
        int i3 = this.c;
        Object obj2 = this.d;
        charSequence.getClass();
        switch (i3) {
            case 0:
                String str = (String) obj2;
                if (pa7.t(charSequence.subSequence(i, i2).toString(), str)) {
                    return null;
                }
                return new ck9(str);
            default:
                int i4 = i2 - i;
                if (i4 < 1) {
                    return new ff8(1, 11);
                }
                if (i4 > 9) {
                    return new ff8(9, 12);
                }
                ze0 ze0Var = (ze0) obj2;
                int iCharAt = 0;
                while (i < i2) {
                    iCharAt = (iCharAt * 10) + (charSequence.charAt(i) - '0');
                    i++;
                }
                Object objE = ze0Var.e(obj, new rh3(iCharAt, i4));
                if (objE == null) {
                    return null;
                }
                return new mjg(objE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al2(txa txaVar, String str) {
        super(str, null);
        txaVar.getClass();
        str.getClass();
        this.d = txaVar;
    }
}
