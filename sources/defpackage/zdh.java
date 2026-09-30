package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zdh implements oeh {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final deh b = new deh();

    public zdh(dz0 dz0Var) {
        this.a = dz0Var.a;
    }

    @Override // defpackage.oeh
    public final ieh a(Uri uri) throws feh, geh {
        if (g(uri)) {
            throw new feh("Android backend cannot perform remote operations without a remote backend");
        }
        File fileW = n3d.w(f(uri));
        return new ieh(fileW, a.b(fileW, new FileInputStream(fileW)));
    }

    @Override // defpackage.oeh
    public final OutputStream b(Uri uri) {
        return this.b.b(f(uri));
    }

    @Override // defpackage.oeh
    public final void c(Uri uri) throws IOException {
        this.b.c(f(uri));
    }

    @Override // defpackage.oeh
    public final String d() {
        return "android";
    }

    @Override // defpackage.oeh
    public final void e(Uri uri, Uri uri2) throws IOException {
        this.b.e(f(uri), f(uri2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:57:0x0118, B:59:0x011c, B:62:0x0131), top: B:88:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Uri f(Uri uri) throws IOException {
        File file;
        File externalFilesDir;
        Account account;
        String absolutePath;
        if (g(uri)) {
            throw new geh("Operation across authorities is not allowed.");
        }
        if (!g(uri)) {
            Context context = this.a;
            if (!uri.getScheme().equals("android")) {
                throw new geh("Scheme must be 'android'");
            }
            if (uri.getPathSegments().isEmpty()) {
                throw new geh(String.format("Path must start with a valid logical location: %s", uri));
            }
            if (!TextUtils.isEmpty(uri.getQuery())) {
                throw new geh("Did not expect uri to have query");
            }
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            String str = (String) arrayList.get(0);
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        externalFilesDir = context.getExternalFilesDir(null);
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!i7h.O(context)) {
                            synchronized (this.c) {
                                try {
                                    absolutePath = this.d;
                                    if (absolutePath == null) {
                                        absolutePath = aic.r(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                        this.d = absolutePath;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                throw new feh("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
                case 94416770:
                    if (str.equals("cache")) {
                        externalFilesDir = context.getCacheDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!i7h.O(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = aic.r(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new feh("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
                case 97434231:
                    if (str.equals("files")) {
                        externalFilesDir = aic.r(context);
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!i7h.O(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = aic.r(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new feh("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
                case 835260319:
                    if (str.equals("managed")) {
                        File file2 = new File(aic.r(context), "managed");
                        if (arrayList.size() >= 3) {
                            try {
                                String str2 = (String) arrayList.get(2);
                                Account account2 = ydh.a;
                                if ("shared".equals(str2)) {
                                    account = ydh.a;
                                } else {
                                    int iIndexOf = str2.indexOf(58);
                                    arb.o(iIndexOf >= 0, "Malformed account", new Object[0]);
                                    account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                                }
                                if (!ydh.a.equals(account)) {
                                    throw new geh("AccountManager cannot be null");
                                }
                            } catch (IllegalArgumentException e) {
                                throw new geh(e);
                            }
                        }
                        externalFilesDir = file2;
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!i7h.O(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = aic.r(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new feh("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
                case 988548496:
                    if (str.equals("directboot-cache")) {
                        externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!i7h.O(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = aic.r(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new feh("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
                case 991565957:
                    if (str.equals("directboot-files")) {
                        externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!i7h.O(context)) {
                            synchronized (this.c) {
                                absolutePath = this.d;
                                if (absolutePath == null) {
                                    absolutePath = aic.r(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.d = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new feh("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
                default:
                    throw new geh(String.format("Path must start with a valid logical location: %s", uri));
            }
        }
        yg5.m("operation is not permitted in other authorities.");
        file = null;
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        dy6 dy6VarM = jy6.m();
        builderPath.path(file.getAbsolutePath());
        yob yobVarG = dy6VarM.g();
        Pattern pattern = meh.a;
        return builderPath.encodedFragment(yobVarG.isEmpty() ? null : "transform=".concat(new ue1("+", 1).b(yobVarG))).build();
    }

    public final boolean g(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
