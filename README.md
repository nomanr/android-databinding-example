# android-databinding-example
A very basic example how to implement data binding in android. 
This example includes how to bind data with a single view and with ListView items.

GetView method in listview custom adapter.
<code>
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);

        MovieListItemBinding binding = DataBindingUtil.
             inflate(inflater, R.layout.movie_list_item, null, false);

        //OR
        //MovieListItemBinding binding = MovieListItemBinding.inflate(inflater,null,false);

        binding.setMovie(getItem(position));
        return binding.getRoot();
        }
</code>

No need to findviewbyid and no viewholder pattern. Just that and listview will be populated. Isn't it cool? :)
