package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xxc extends Exception {
    private final int errorCode;

    public xxc(String str) {
        super(str);
        int i = 0;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "service_not_available":
                    i = 3;
                    break;
                case "toomanymessages":
                    i = 4;
                    break;
                case "invalid_parameters":
                case "missing_to":
                    i = 1;
                    break;
                case "messagetoobig":
                    i = 2;
                    break;
            }
        }
        this.errorCode = i;
    }
}
