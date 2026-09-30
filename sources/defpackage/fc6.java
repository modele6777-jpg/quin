package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fc6 extends m13 {
    public final String c;

    public fc6(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.c = str2;
        int length = str.length();
        String str7 = null;
        if (length <= 0) {
            qc0.j("id should not be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            qc0.j("idToken should not be empty");
            throw null;
        }
        List listC0 = v4e.c0(str2, new String[]{"."}, 6);
        if (listC0.size() != 3) {
            qc0.j("Invalid token format");
            throw null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listC0.get(1), 8);
            bArrDecode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString("email");
            strOptString = strOptString.length() == 0 ? null : strOptString;
            String strOptString2 = jSONObject.optString("sub");
            if (strOptString2.length() != 0) {
                str7 = strOptString2;
            }
            if (str7 == null) {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
            iy9 iy9Var = new iy9(strOptString, str7);
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
