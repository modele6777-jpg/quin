package defpackage;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ka8 {
    public static ma8 a(ka8 ka8Var, CharSequence charSequence) {
        int i = la8.a;
        ace aceVar = pa8.a;
        o1 o1Var = (o1) aceVar.getValue();
        ka8Var.getClass();
        charSequence.getClass();
        o1Var.getClass();
        if (o1Var != ((o1) aceVar.getValue())) {
            return (ma8) o1Var.c(charSequence);
        }
        try {
            String string = charSequence.toString();
            string.getClass();
            return new ma8(LocalDate.parse(uyb.B(6, string)));
        } catch (DateTimeParseException e) {
            throw new kg3(e);
        }
    }

    public final xn7 serializer() {
        return sa8.a;
    }
}
