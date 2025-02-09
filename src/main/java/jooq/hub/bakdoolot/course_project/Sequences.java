/*
 * This file is generated by jOOQ.
 */
package hub.bakdoolot.course_project;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Sequences {

    /**
     * The sequence <code>public.account_course_seq</code>
     */
    public static final Sequence<Long> ACCOUNT_COURSE_SEQ = Internal.createSequence("account_course_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.account_rating_seq</code>
     */
    public static final Sequence<Long> ACCOUNT_RATING_SEQ = Internal.createSequence("account_rating_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.course_seq</code>
     */
    public static final Sequence<Long> COURSE_SEQ = Internal.createSequence("course_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.like_seq</code>
     */
    public static final Sequence<Long> LIKE_SEQ = Internal.createSequence("like_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.likes_seq</code>
     */
    public static final Sequence<Long> LIKES_SEQ = Internal.createSequence("likes_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.playlist_seq</code>
     */
    public static final Sequence<Long> PLAYLIST_SEQ = Internal.createSequence("playlist_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.rating_seq</code>
     */
    public static final Sequence<Long> RATING_SEQ = Internal.createSequence("rating_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.tb_like_seq</code>
     */
    public static final Sequence<Long> TB_LIKE_SEQ = Internal.createSequence("tb_like_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.user_account_seq</code>
     */
    public static final Sequence<Long> USER_ACCOUNT_SEQ = Internal.createSequence("user_account_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.users_seq</code>
     */
    public static final Sequence<Long> USERS_SEQ = Internal.createSequence("users_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);

    /**
     * The sequence <code>public.video_seq</code>
     */
    public static final Sequence<Long> VIDEO_SEQ = Internal.createSequence("video_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, 50, null, null, false, null);
}
