package defpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ta8 {
    public static va8 a(ta8 ta8Var, String str) {
        xa8 xa8Var = ua8.a;
        ta8Var.getClass();
        str.getClass();
        xa8Var.getClass();
        try {
            String string = str.toString();
            string.getClass();
            return new va8(LocalDateTime.parse(uyb.B(12, string)));
        } catch (DateTimeParseException e) {
            throw new kg3(e);
        }
    }

    public final xn7 serializer() {
        return ab8.a;
    }
}
