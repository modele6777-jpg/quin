package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class me5 {
    public static final char a;
    public static final char b;

    static {
        Character.toString('.');
        char c = File.separatorChar;
        a = c;
        char c2 = '\\';
        if (c != '/') {
            if (c != '\\') {
                qc0.j(String.valueOf(c));
                return;
            }
            c2 = '/';
        }
        b = c2;
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    public static int a(String str) {
        int i;
        char c = a;
        if (c == '\\') {
            int iLastIndexOf = str.lastIndexOf(c);
            int iLastIndexOf2 = str.lastIndexOf(b);
            if (iLastIndexOf == -1) {
                i = iLastIndexOf2 == -1 ? 0 : iLastIndexOf2 + 1;
            } else {
                if (iLastIndexOf2 != -1) {
                    iLastIndexOf = Math.max(iLastIndexOf, iLastIndexOf2);
                }
                i = iLastIndexOf + 1;
            }
            if (str.indexOf(58, i) != -1) {
                qc0.j("NTFS ADS separator (':') in file name is forbidden.");
                return 0;
            }
        }
        int iLastIndexOf3 = str.lastIndexOf(46);
        if (Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) > iLastIndexOf3) {
            return -1;
        }
        return iLastIndexOf3;
    }
}
