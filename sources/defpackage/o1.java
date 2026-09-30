package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 {
    public abstract v81 a();

    public abstract gu2 b();

    public final Object c(CharSequence charSequence) {
        String str;
        charSequence.getClass();
        try {
            n0a n0aVar = a().c;
            n0aVar.getClass();
            try {
                return d(dj6.R(n0aVar, charSequence, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new kg3(str, e);
            }
        } catch (f0a e2) {
            throw new kg3("Failed to parse value from '" + ((Object) charSequence) + '\'', e2);
        }
    }

    public abstract Object d(gu2 gu2Var);
}
