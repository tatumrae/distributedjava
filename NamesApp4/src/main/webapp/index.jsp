<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:34 PM
    Author     : tatum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Succulent Center | The Source for Succulents</title>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="//fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css">
        <link href="../src/css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">Succulent Center</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="products.jsp">Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="cart.jsp">Cart</a>
                </li>
<!--                <li class="nav-item">
                    <a class="nav-link" href="contact.jsp">Contact</a>
                </li>-->
            </ul>
            
            <form class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input type="text" class="form-control" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="button" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="cart.jsp">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light">3</span>
                </a>
            </form>
        </div>
    </div>
</nav>

<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">Succulent Center</h1>
        <p class="lead text-muted mb-0">The Source for Succulents</p>
    </div>
</section>
<div class="container">
    <div class="row">
        <div class="col">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="images/succulent-favors-party-gift-bulk-succulents-rosette_855_365.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/succulent-wedding-favor-gifts-succulents-assorted_855_365.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/succulents-for-sale-at-desert-horizon-nursery-in-the-phoenix-area-855_365.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="col-12 col-md-3">
            <div class="card">
                <div class="card-header bg-success text-white text-uppercase">
                    <i class="fa fa-heart"></i> Favorite product
                </div>
                <img class="img-fluid border-0" src="images/Donkey_Tail_600_400.jpg" alt='Donkey "Burros" Tail'>
                <div class="card-body">
                    <h4 class="card-title text-center"><a href="product.jsp" title="View Product">Donkey "Burros" Tail</a></h4>
                    <div class="row">
                        <div class="col">
                            <p class="btn btn-danger btn-block">$2.40</p>
                        </div>
                        <div class="col">
                            <a href="product.jsp" class="btn btn-success btn-block">View</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="container mt-3">
    <div class="row">
        <div class="col-sm">
            <div class="card">
                <div class="card-header bg-primary text-white text-uppercase">
                    <i class="fa fa-star"></i> Our Latest Additions
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/Perle_Von_Nurnberg_600_400.jpg" alt="Echeveria 'Perle Von Nürnberg'">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Echeveria 'Perle Von Nürnberg'</a></h4>
                                    <p class="card-text">A beautiful rosette-forming succulent that has interestingly colored acuminate leaves that are a pale grayish brown with pink highlights and have a white powdery dusting, sometimes referred to as pruinose.</p>

<p>The leaves overlap nicely in 5 to 6 inch wide solitary rosettes that eventually grow up on a slender stem. The flowers, which appear in summer on 1 foot long reddish-stemmed inflorescences, are a corral pink color on the exterior with a yellow interior.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$1.90</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/Powder_Puff_Graptoveria_600_400.jpg" alt="Powder Puff Graptoveria">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Powder Puff Graptoveria</a></h4>
                                    <p class="card-text">A beautiful, hybrid succulent with powdery, silvery-blue leaves that blush violet in strong light or cold temperatures. Plants have semi decumbent stems terminating in rosettes. It forms arching raceme of small, bell-shaped, apricot flowers during summer months. Great for cascading in rock gardens or as hanging basket.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$1.90</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/black_prince_600_400.jpg" alt="Echeveria 'Black Prince'">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Echeveria 'Black Prince'</a></h4>
                                    <p class="card-text">(Black Hens and Chicks) - This succulent plant produces clumps of short rosettes up to 3 inches wide with thin dark triangular, blackish leaves.</p>

<p>These leaves first emerge greenish but darken to a deep lavender brown and with age the lower leaves widen out to as much as 1 inch at the base with an acuminate tip that has fine yellow edges. In late fall to early winter appear the dark red flowers on short stalks.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$2.40</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/jelly_bean_600_400.jpg" alt="Jelly Bean">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Jelly Bean</a></h4>
                                    <p class="card-text">The jelly bean plant, also called pork and beans, is an interesting succulent plant that displays jelly beanlike leaves. In the summertime its leaves change from green to bright red, and it bears yellow flowers in the springtime. This colorful succulent does best in hot, sunny apartment balcony gardens and will look best as a “ground cover” in plant containers underneath tall plants with a small footprint, such as a jade plant pruned to look like a tree.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$2.40</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="container mt-3 mb-4">
    <div class="row">
        <div class="col-sm">
            <div class="card">
                <div class="card-header bg-primary text-white text-uppercase">
                    <i class="fa fa-trophy"></i> Our Best Sellers
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/Parva_600_400.jpg" alt="Parva">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Parva</a></h4>
                                    <p class="card-text">Echeveria Parva grows in a mat of icy blue rosettes. Bright red spots of color adorn the leaf tips. This is a smaller echeveria variety (in latin, parva means dwarf). For best results plant in full to partial sun. Bicolor bell shaped golden and orange flowers appear in spring and early summer.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$1.90</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/Sedevaria_Jet_Bead_600_400.jpg" alt="Sedeveria Jet Bead">
                                <img src="" alt=""/>
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Sedeveria Jet Bead</a></h4>
                                    <p class="card-text">Sedeveria ‘Jet Beads’ is a distinctive hybrid of Sedum and Echeveria, with dark bronze tinted green foliage surrounding short sprawling stems, up to 4 inches (10 cm) tall. The pointy tipped leaves are arranged along stems like a string of beads and take on a near black tone in cooler weather, giving this plant its cultivar name. It has yellow flowers in summer months.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$1.90</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/PORTULACARIA_AFRA_VARIEGATA_600_400.jpg" alt="Portulacaria Afra Variegata">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Portulacaria Afra Variegata</a></h4>
                                    <p class="card-text">A sprawling, slow growing succulent shrub with attractive reddish-brown stems and variegated cream and green ¾ inch long leaves. A very easy to grow succulent that works as a great bonsai plant, hanging basket or even a hedge in frost free climates. The green form will slowly reach 12 feet in height with an equal spread but the variegated form is slower growing and will likely remain considerably smaller and in containers even more so.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$2.40</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm">
                            <div class="card">
                                <img class="card-img-top" src="images/Zebra_Haworthia_600_400.jpg" alt="Zebra Haworthia">
                                <div class="card-body">
                                    <h4 class="card-title"><a href="product.jsp" title="View Product">Zebra Haworthia</a></h4>
                                    <p class="card-text">Haworthias are dainty succulent plants which are frequently compared to Aloes, this is hardly surprising since they are both members of the Asphodeloideae family. Haworthias are almost always small and very (very) slow growing plants but tend to look brilliant in unusual containers or interesting soil mixes. As a result they can make fantastic easy care gifts and presents for people, suiting either a home or office desk environment.</p>
                                    <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">$1.90</p>
                                        </div>
                                        <div class="col">
                                            <a href="cart.jsp" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- Footer -->
<footer class="text-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-lg-4 col-xl-3">
                <h5>About</h5>
                <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                <p class="mb-0">
                    Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.
                </p>
            </div>

            <div class="col-md-2 col-lg-2 col-xl-2 mx-auto">
                <h5>Informations</h5>
                <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                <ul class="list-unstyled">
                    <li><a href="">Link 1</a></li>
                    <li><a href="">Link 2</a></li>
                    <li><a href="">Link 3</a></li>
                    <li><a href="">Link 4</a></li>
                </ul>
            </div>

            <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
                <h5>Others links</h5>
                <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                <ul class="list-unstyled">
                    <li><a href="">Link 1</a></li>
                    <li><a href="">Link 2</a></li>
                    <li><a href="">Link 3</a></li>
                    <li><a href="">Link 4</a></li>
                </ul>
            </div>

            <div class="col-md-4 col-lg-3 col-xl-3">
                <h5>Contact</h5>
                <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                <ul class="list-unstyled">
                    <li><i class="fa fa-home mr-2"></i> My company</li>
                    <li><i class="fa fa-envelope mr-2"></i> email@example.com</li>
                    <li><i class="fa fa-phone mr-2"></i> + 33 12 14 15 16</li>
                    <li><i class="fa fa-print mr-2"></i> + 33 12 14 15 16</li>
                </ul>
            </div>
            <div class="col-12 copyright mt-3">
                <p class="float-left">
                    <a href="#">Back to top</a>
                </p>
                <p class="text-right text-muted">created with <i class="fa fa-heart"></i> by <a href="https://t-php.fr/43-theme-ecommerce-bootstrap-4.jsp"><i>t-php</i></a> | <span>v. 1.0</span></p>
            </div>
        </div>
    </div>
</footer>

<!-- JS -->
<script src="//code.jquery.com/jquery-3.2.1.slim.min.js" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" type="text/javascript"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" type="text/javascript"></script>

</body>
</html>
